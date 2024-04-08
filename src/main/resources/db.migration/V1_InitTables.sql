CREATE TABLE books (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       code VARCHAR(255),
                       name VARCHAR(255),
                       category VARCHAR(255)
);
CREATE TABLE libraries (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255),
                           location VARCHAR(255)
);
CREATE TABLE book_library (
                              book_id BIGINT,
                              library_id BIGINT,
                              PRIMARY KEY (book_id, library_id),
                              FOREIGN KEY (book_id) REFERENCES books(id),
                              FOREIGN KEY (library_id) REFERENCES libraries(id)
);
INSERT INTO libraries (name, location) VALUES
                                           ('Library A', 'Location A'),
                                           ('Library B', 'Location B'),
                                           ('Library C', 'Location C');
INSERT INTO book_library (book_id, library_id) VALUES
                                                   (1, 1),
                                                   (2, 1),
                                                   (3, 2),
                                                   (4, 2),
                                                   (5, 3),
                                                   (6, 3);

INSERT INTO books (code, name, category) VALUES
                                             ('B001', 'Book 1', 'Fiction'),
                                             ('B002', 'Book 2', 'Non-fiction'),
                                             ('B003', 'Book 3', 'Thriller'),
                                             ('B004', 'Book 4', 'Science Fiction'),
                                             ('B005', 'Book 5', 'Romance'),
                                             ('B006', 'Book 6', 'Mystery'),
                                             ('B007', 'Book 7', 'Fantasy'),
                                             ('B008', 'Book 8', 'Biography'),
                                             ('B009', 'Book 9', 'History'),
                                             ('B010', 'Book 10', 'Self-help');