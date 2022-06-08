-- Aggregate

SELECT MAX(price) FROM phones
SELECT MIN(price) FROM phones
SELECT AVG(price) FROM phones
SELECT SUM(price) FROM phones
SELECT COUNT(price) FROM phones

-- 

SELECT price FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT MAX(price) FROM phones

-- Вывести "настоящее" среднее значение цены
SELECT SUM(price * quantity)/SUM(quantity) FROM phones

-- Вывести информацию о телефонах с максимальной ценой
SELECT * FROM phones
ORDER BY price
DESC
LIMIT 1

-- Вывести информацию о телефонах с максимальной ценой
SELECT * FROM phones
WHERE price = (SELECT MAX(price) FROM phones)

UPDATE phones
SET price = 140000
WHERE id = 99

-- Вывести все телефоны с ценой ниже среднего
SELECT * FROM phones
WHERE price < (SELECT AVG(price) FROM phones)

-- Вывести список всех производителей
SELECT DISTINCT(manufacturer) FROM phones

-- Вывести количество всех производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- Вывести среднюю цену телефонов по производителю
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer

-- Вывести количество моделей
SELECT model, SUM(quantity) FROM phones
GROUP BY model

-- Вывести среднюю цену телефонов по производителю, где средняя цена выше 50000
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer
HAVING ROUND(AVG(price), 2) > 50000

-- JOIN

-- Вывести имя товара, цену на товар и название производителя товара
SELECT pr.name AS товар, pc.value AS цена, m.name AS производитель FROM products pr
	JOIN manufacturers m ON pr.manufacturer_id = m.id
	JOIN prices pc ON pc.product_id = pr.id
	
SELECT pr.name , pc.value FROM products pr LEFT JOIN prices pc ON pc.product_id = pr.id

SELECT pr.name , pc.value FROM prices pc RIGHT JOIN products pr ON pc.product_id = pr.id

SELECT * FROM products pr 
	RIGHT JOIN manufacturers m ON pr.manufacturer_id = m.id
	LEFT JOIN prices pc ON pc.product_id = pr.id


-- Вывести товары без цены
SELECT pr.name , pc.value FROM products pr 
	LEFT JOIN prices pc ON pc.product_id = pr.id
WHERE pc.value IS null


-- JOIN + Filtering + Sorting
SELECT * FROM products pr 
	RIGHT JOIN manufacturers m ON pr.manufacturer_id = m.id
	LEFT JOIN prices pc ON pc.product_id = pr.id
WHERE m.location != 'Moscow' AND pc.value > 6000
ORDER BY pc.value
DESC
LIMIT 5

-- Вывести все товары из Москвы с ценой больше 15000
SELECT * FROM products pr 
	RIGHT JOIN manufacturers m ON pr.manufacturer_id = m.id
	LEFT JOIN prices pc ON pc.product_id = pr.id
WHERE m.location = 'Moscow' AND pc.value > 15000


-- Вывести все товары из Москвы с ценой больше 15000
SELECT * FROM products pr 
	JOIN manufacturers m ON pr.manufacturer_id = m.id AND m.location = 'Moscow'
	JOIN prices pc ON pc.product_id = pr.id AND pc.value > 15000
	
-- JOIN + GROUP BY
-- Вывести среднюю цену по городам
SELECT m.location, AVG(pc.value) FROM products pr 
	JOIN manufacturers m ON pr.manufacturer_id = m.id
	JOIN prices pc ON pc.product_id = pr.id
GROUP BY m.location


