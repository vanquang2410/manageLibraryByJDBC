package com.example.learnJDBC.repository;

import com.example.learnJDBC.entity.Books;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@NoArgsConstructor
@AllArgsConstructor
public class BookRepositoryImpl implements BookRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Books> getAll() {

        try{
            return jdbcTemplate.query("select * from books b",(resultSet, rowNum) ->
                    new Books(resultSet.getLong("id"),
                            resultSet.getString("code"),
                            resultSet.getString("name"),
                            resultSet.getString("category"))
            );
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Books> getAllBookInlibrary(Long id) {
        try{
            return jdbcTemplate.query("select books.* from books  inner join book_library on books.id=book_library.book_id where book_library.library_id=?", new Object[]{id},(resultSet, rowNum) ->
                    new Books(resultSet.getLong("id"),
                            resultSet.getString("code"),
                            resultSet.getString("name"),
                            resultSet.getString("category"))
            );
        }
        catch (Exception e){
            return null;
        }

    }

    @Override
    public Books getBookByIndex(Long id) {
        try{
            return jdbcTemplate.queryForObject(
                    "SELECT * FROM books WHERE id = ?",
                    new Object[]{id},
                    (resultSet, rowNum) -> new Books(
                            resultSet.getLong("id"),
                            resultSet.getString("code"),
                            resultSet.getString("name"),
                            resultSet.getString("category")
                    )
            );
        }
        catch (Exception e){
            return null ;
        }

    }

    @Override
    public Books addBook(Books books) {
        try{
             jdbcTemplate.update("insert into Books(code,name,category) values (?,?,?)"
                    ,books.getCode(),books.getName(),books.getCategory());
             return jdbcTemplate.queryForObject("SELECT * FROM books WHERE id = LAST_INSERT_ID()",
                     (resultSet, rowNum) -> new Books(
                             resultSet.getLong("id"),
                             resultSet.getString("code"),
                             resultSet.getString("name"),
                             resultSet.getString("category")
                     )
                     );
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public Books updateBooks(Books books,Long id ) {
        try{
            jdbcTemplate.update("update books set  name =?,code = ? , category= ? where id=? ",books.getName(),books.getCode(),books.getCategory(),id);
            books.setId(id);
            return  books;
        }
        catch (Exception e){
            return  null;
        }

    }
}
