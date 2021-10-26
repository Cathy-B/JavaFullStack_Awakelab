--Consulta D
SELECT f.rating, COUNT(*)
FROM film f
WHERE f.original_language_id = 5
GROUP BY f.rating
ORDER BY COUNT(*) DESC;