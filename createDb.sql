--
create table article(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	title	VARCHAR(50),
	content	TEXT,
	author	VARCHAR(50),
	create_date	DATE,
	update_date	DATE
);

insert into article(title,content,author,create_date)
values("hello sqlite3","just for test","shenzl",datetime('now'));