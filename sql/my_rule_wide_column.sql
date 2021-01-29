create table my_rule_wide_column (
                                     id int primary key  auto_increment,
                                     group_id int ,
                                     enable boolean default 1,
                                     type int,
                                     backup_number_per int,
                                     backup_number_max int,
                                     red_eye_flight_number_per int,
                                     red_eye_flight_number_max int,
                                     two_end_flight_number_per int,
                                     two_end_flight_number_max int,
                                     update_time datetime default current_timestamp on update current_timestamp
);
