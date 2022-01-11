create table user(id bigint primary key , birthDate date, name varchar(255));
create table post(id bigint primary key , description varchar(255), userId bigint references user);

insert into user values(10001, sysdate(), 'AB');
insert into user values(10002, sysdate(), 'Jill');
insert into user values(10003, sysdate(), 'Jam');
insert into post values(11001, 'My First Post', 10001);
insert into post values(11002, 'My Second Post', 10001);