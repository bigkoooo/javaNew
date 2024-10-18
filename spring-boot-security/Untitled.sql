create table if not exists Todo ( id bigint not null primary key, userId varchar(255) not null, title varchar(255) not null, done boolean default false );

DESC Todo;

DROP TABLE IF EXISTS Todo;

select * from Todo;