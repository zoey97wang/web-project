create table guestbook(
name varchar(20),
email varchar(30),
comments varchar(30),
creation_date date
)

alter table guestbook add(phoneNumber varchar(20))
alter table guestbook add(gender varchar(20))
select * from guestbook