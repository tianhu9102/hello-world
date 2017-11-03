select acid,trackno,min(timestamped) ,max(timestamped),count(1) from RADAR t where trackno=652 group by acid,trackno order by acid,trackno;
create table radar_at tablespace users as
select acid,trackno,min(timestamped) mint,max(timestamped) maxt,count(1) cnt from RADAR t  group by acid,trackno order by acid,trackno;

select * from radar_at ;