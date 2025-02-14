ALTER TABLE books
    ADD COLUMN page_count INT NOT NULL DEFAULT 0;

SELECT *
FROM books
WHERE page_count > (SELECT AVG(page_count) FROM books);

ALTER TABLE books
    ADD COLUMN quantity INT NOT NULL DEFAULT 0;

SELECT *
FROM books
WHERE publication_year = (SELECT MAX(publication_year) FROM books);

SELECT *
FROM	(SELECT book_title, SUM(quantity * price) AS total_pr
         FROM books
         GROUP BY book_title)
WHERE total_pr > 1000
ORDER BY total_pr;

SELECT
    b.book_title,
    b.publication_year,
    a.author_name,
    CASE
        WHEN b.publication_year >= 2000 THEN 'Очень новая'
        WHEN b.publication_year >= 1900 THEN 'Новая'
        WHEN b.publication_year >= 1850 THEN 'Относительно новая'
        ELSE 'Старая'
        END AS book_age
FROM
    books AS b
        JOIN
    authors_books AS ab ON b.book_id = ab.book_id
        JOIN
    authors AS a ON ab.author_id = a.author_id;