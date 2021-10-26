--Consulta C
SELECT f.film_id, f.title, f.release_year, f.rating
FROM film f
LEFT JOIN film_category fc ON f.film_id = fc.film_id
LEFT JOIN film_actor fa ON f.film_id = fa.film_id
LEFT JOIN actor a ON fa.actor_id = a.actor_id
LEFT JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Horror' 
AND a.first_name = 'SUSAN' And a.last_name = 'DAVIS'
ORDER BY f.title ASC;