--Consulta E
SELECT a.first_name, a.last_name, COUNT(fa.film_id)
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
LEFT JOIN film f ON fa.film_id = f.film_id
WHERE f.rating = 'PG' OR f.rating = 'PG-13' OR f.rating = 'G'
GROUP BY a.first_name, a.last_name
ORDER BY COUNT(fa.film_id) DESC;
