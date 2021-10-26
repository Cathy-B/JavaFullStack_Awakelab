--Consulta B
SELECT * FROM
    (SELECT f.title, f.length, f.release_year, f.rental_rate, f.special_features
     FROM film f
     WHERE f.rating = 'R'
     ORDER BY f.length DESC
)WHERE ROWNUM <11;