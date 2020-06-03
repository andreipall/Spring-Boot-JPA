create table author (id bigint not null auto_increment, age integer not null, genre varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table book (id bigint not null auto_increment, isbn varchar(255), title varchar(255), author_id bigint, primary key (id)) engine=InnoDB
alter table book add constraint FKklnrv3weler2ftkweewlky958 foreign key (author_id) references author (id)
INSERT INTO `author` (`age`, `name`, `genre`, `id`) VALUES (23, "Mark Janel", "Anthology", 1)
INSERT INTO `author` (`age`, `name`, `genre`, `id`) VALUES (43, "Olivia Goy", "Horror", 2)
INSERT INTO `author` (`age`, `name`, `genre`, `id`) VALUES (51, "Quartis Young", "Anthology", 3)
INSERT INTO `author` (`age`, `name`, `genre`, `id`) VALUES (34, "Joana Nimar", "History", 4)
INSERT INTO `book` (`isbn`, `title`, `author_id`, `id`) VALUES ("001-JN", "A History of Ancient Prague", 4, 1)
INSERT INTO `book` (`isbn`, `title`, `author_id`, `id`) VALUES ("002-JN", "A People's History", 4, 2)
INSERT INTO `book` (`isbn`, `title`, `author_id`, `id`) VALUES ("001-MJ", "The Beatles Anthology", 1, 3)
INSERT INTO `book` (`isbn`, `title`, `author_id`, `id`) VALUES ("001-OG", "Carrie", 2, 4)
