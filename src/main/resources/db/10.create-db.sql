create table COR_PATIENT (
    ID serial,
    NAME varchar(255),
    BIRTH_DATE date,
    --
    primary key (ID)
);

create table COR_VITAL_SIGNS (
    ID serial,
    BLOOD_PRESSURE integer not null,
    REGISTRATION_DATE date not null,
    SYSTOLIC integer not null,
    DIASTOLIC integer not null,
    PATIENT_ID serial not null,
    --
    primary key (ID)
);

-- constraints

alter table COR_VITAL_SIGNS add constraint FK_COR_VITAL_SIGNS_ON_PATIENT foreign key (PATIENT_ID) references COR_PATIENT(ID);


-- indexes

create index IDX_COR_VITAL_SIGNS_ON_PATIENT on COR_VITAL_SIGNS (PATIENT_ID);
