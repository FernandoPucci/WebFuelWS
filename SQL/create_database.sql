CREATE USER WF_DEV
IDENTIFIED BY 123456;
  
GRANT create session TO WF_DEV;
GRANT create table TO WF_DEV;
GRANT create view TO WF_DEV;
GRANT create any trigger TO WF_DEV;
GRANT create any procedure TO WF_DEV;
GRANT create sequence TO WF_DEV;
GRANT create synonym TO WF_DEV;
GRANT create TYPE TO WF_DEV;

