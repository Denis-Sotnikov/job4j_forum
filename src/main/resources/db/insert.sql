insert into authorities(authority) values ('ROLE_USER');
insert into authorities(authority) values ('ROLE_ADMIN');
insert into users(username,enabled, password, authority_id) values ('root', true, '$2a$10$wY1twJhMQjGVxv4y5dBC5ucCBlzkzT4FIGa4FNB/pS9GaXC2wm9/W', 2);

insert into posts (name) values ('О чем этот форум?');
insert into posts (name) values ('Правила форума.');