# wildlife-tracker
WildLife Tracker: An app that aims at tracking the wildlife numbers at a local animal park, Rangers are able to spot animals, both endangered and non-endangered then record them in a sightings record.
![Screenshot from 2020-07-21 10-35-54](https://user-images.githubusercontent.com/63198747/88026336-64eebd80-cb3e-11ea-826d-abc171610386.png)

image of animal form

![Screenshot from 2020-07-21 10-45-50](https://user-images.githubusercontent.com/63198747/88027063-708eb400-cb3f-11ea-9b25-754c45eb4d6f.png)

image of endAngered form
![Screenshot from 2020-07-21 10-48-41](https://user-images.githubusercontent.com/63198747/88027376-d3804b00-cb3f-11ea-9d45-e488a1177ff7.png)

SQL
1.Launch postgres
2.Type in psql
Run these commands
3. CREATE DATABASE Wildlife_tracker;
4. \c Wildlife_tracker;
5. CREATE TABLE animals (id serial PRIMARY KEY, name varchar,);
6. CREATE TABLE wildlife_tracker=# CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, timestamp timestamp);
7. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
