CREATE TABLE tb_gasto
(
    id             serial primary key,
    descricao      varchar(250) not null,
    valor          numeric(10, 2),
    data_vencimento date,
    tipoGasto      varchar(50)  not null,
    status         varchar(20)  not null
);
