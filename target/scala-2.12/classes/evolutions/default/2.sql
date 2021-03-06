# --- Sample dataset
 
# --- !Ups
 
delete from item_on_sale;
delete from category;
 
insert into category (id,name) values ( 1,'Trainers' );
insert into category (id,name) values ( 2,'Shorts' );
insert into category (id,name) values ( 3,'Bottoms' );
insert into category (id,name) values ( 4,'Leggings' );
insert into category (id,name) values ( 5,'Hoodies' );
insert into category (id,name) values ( 6,'Jackets' );


insert into item_on_sale (id,category_id,name,description,stock,price) values ( 1,1,'Nike Air Max 270','Black Nike Air Max 270 with red heel',100, 144.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 2,5,'Adidas Hoodie','Grey Adidas Original Hoodie',100,35.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 3,2,'Under Armour Shorts','Grey Under Armour Shorts With A Black Logo',100,25.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 4,1,'Nike React Element','New Nike React Element 55',100,115.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 5,1,'Adidas Yeezys','Brand New Set of Shoes From The Yeezy Collection',100,999.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 6,4,'Nike Gym Leggings','Comfortable Nike Gym Leggings in Plus Sizes',100,35.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 7,1,'Under Armour Trainers','Black and Orange Under Armour Trainers',100,75.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 8,4,'Adidas Leggings','Adidas Original 3 Stripe Leggings',100,35.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 9,6,'Under Armour Jacket','Blue Hooded Under Armour Jacket',100,100.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 10,6,'Nike Rain Jacket','Red Nike Rain Jacket',100,65.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 11,3,'Nike Tracksuit Bottoms','Comfortable Black Nike Joggers',100,40.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 12,3,'Nike Tracksuit Bottoms','Grey Nike Tech Fleece Bottoms',100,45.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 13,4,'Nike Leggings','Womens Nike Leggings',100,35.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 14,3,'Under Armour Tracksuit Bottoms','Grey Under Armour Bottoms With Black Logo',100,40.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 15,5,'Under Armour Hoodie','Blue Under Armour Hoodie',100,50.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 16,6,'NorthFace Windbreaker','Yellow NorthFace Windbreaker Jacket',100,165.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 17,2,'Nike Shorts','Nike Shorts With White Logo',100,25.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 18,2,'Adidas Shorts','Black Adidas Shorts With White Logo',100,20.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 19,5,'Nike Hoodie','Red Nike Hoodie',100,40.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 20,1,'Nike React Elements','Nike React Elements Black,White,Grey,Orange',100,115.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 21,2,'Under Armour Shorts','Black&Orange Under Armour Shorts',100,25.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 22,6,'NorthFace Jacket','Blue NorthFace Bubble Jacket',100,150.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 23,4,'Under Armour Leggings','Black,Grey&Purple Under Armour Leggings',100,30.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 24,5,'Nike Hoodie','White Nike Swoosh Hoodie',100,45.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 25,3,'Puma Tracksuit Bottoms','Grey Puma Bottoms With The Logo Down The Side',100,30.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 26,3,'Nike Tracksuit Bottoms','Red Nike Tracksuit Bottoms',100,29.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 27,3,'Under Armour Tracksuit Bottoms','Grey Slim Fit Tracksuit Bottoms',100,39.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 28,2,'Under Armour Shorts ','2in1 Under Armour Shorts With Compression Shorts added in. ',100,35.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 29,1,'Adidas Trainers','Black Adidas Trainers With White Stripes',100,70.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 30,1,'Under Armour Trainers','Black And Green Runnnig Shoes',100,65.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 31,4,'Nike Gym Leggings','Silver Nike Cropped Leggings',100,44.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 32,4,'Adidas Gym Leggings','Grey And Black Adidas Leggings',100,40.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 33,5,'Puma Hoodie','Grey Puma Hoodie With Black Logo',100,50.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 34,6,'Berghaus Jacket','Green Heavy Berghaus Rain Jacket',100,165.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 35,5,'Berghaus Hoodie','Full Zip Grey Berghaus Hodie',100,60.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 36,6,'NorthFace Jacket','Heavy Black NorthFace Jacket with Furry Hood',100,199.99);
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 37,3,'Nike Tracksuit Bottoms','Black Nike Tech Fleece Bottoms',100,50.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 38,2,'Nike Shorts','Black Nike Air Shorts',100,29.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 39,1,'Nike Air Max 270','Exclusive Green Nike Air Max 270',100,144.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 40,1,'Nike Vapormax','Hot Pink Womens Nike Vapormax',100,180.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 41,2,'Adidas Shorts','Blue Adidas Swim Shorts With White Stripes',100,30.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 42,6,'Berghaus Jacket','Red And Navy Berghaus Jacket',100,135.00 );