
CREATE TABLE authors (
    author_id SERIAL PRIMARY KEY,
    author_name VARCHAR(255)
);

CREATE TABLE publishers (
     publisher_id SERIAL PRIMARY KEY,
     publisher_name VARCHAR(255),
     publisher_city VARCHAR(100)
);

CREATE TABLE books (
     book_id SERIAL PRIMARY KEY,
     book_title VARCHAR(255),
     publisher_id INTEGER,
     publication_year INTEGER,
     FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)
);

CREATE TABLE authors_books (
     author_id INTEGER,
     book_id INTEGER,
     PRIMARY KEY (author_id, book_id),
     FOREIGN KEY (author_id) REFERENCES authors(author_id),
     FOREIGN KEY (book_id) REFERENCES books(book_id)
);

INSERT INTO authors (author_name)
VALUES ('Федор Достоевский'),
       ('Александр Пушкин'),
       ('Джейн Остин'),
       ('Рэй Брэдбери');

INSERT INTO publishers (publisher_name, publisher_city)
VALUES ('Эксмо', 'Москва'),
       ('АСТ', 'Москва'),
       ('Penguin Books', 'London'),
       ('HarperCollins', 'New York');

INSERT INTO books (book_title, publisher_id, publication_year)
VALUES ('Гордость и предубеждение', 3, 1813),
       ('Евгений Онегин', 2, 1833),
       ('Преступление и наказание', 1, 1866),
       ('Идиот', 1, 1869),
       ('451 градус по Фаренгейту', 4, 1953);


INSERT INTO authors_books (author_id, book_id)
VALUES (1, 3),
       (2, 2),
       (3, 1),
       (4, 5),
       (1, 4);

SELECT b.book_title, b.publication_year, p.publisher_name, p.publisher_city
FROM books b
JOIN publishers p ON b.publisher_id = p.publisher_id;