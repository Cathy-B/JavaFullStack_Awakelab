--Consulta A
SELECT f.film_id, f.title, f.length, f.rental_duration, f.rental_rate, f.rating
FROM film f
WHERE f.description LIKE '%Secret Agent%'
AND f.rental_duration >= 5
ORDER BY f.rental_duration DESC, f.rental_rate ASC;