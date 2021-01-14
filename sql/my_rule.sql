create table my_rule (
                      id int primary key  auto_increment,
                      group_id int ,
                      enable boolean default 1,
                      type int,
                      data json,
                      update_time datetime default current_timestamp on update current_timestamp
);
