--Criando da Tabela TipoProduto
CREATE TABLE tipoproduto
(
    idtipoproduto SERIAL,
    descricaotipo character varying COLLATE pg_catalog."default",
    CONSTRAINT tipoproduto_pkey PRIMARY KEY (idtipoproduto)
        USING INDEX TABLESPACE projetos
);


--Criando da Tabela Produto
CREATE TABLE produto
(
    idproduto SERIAL,
    produto character varying(30) COLLATE pg_catalog."default",
    detalhamento character varying COLLATE pg_catalog."default",
    valorproduto numeric(5,2),
    tipoproduto integer,
    foto character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT produto_pkey PRIMARY KEY (idproduto)
        USING INDEX TABLESPACE projetos,
    CONSTRAINT produto_tipoproduto_fkey FOREIGN KEY (tipoproduto)
        REFERENCES tipoproduto (idtipoproduto) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

--Criando da Tabela TipoUsuario
CREATE TABLE tipousuario
(
    idtipousuario SERIAL,
    descricaotipousuario character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT tipousuario_pkey PRIMARY KEY (idtipousuario)
        USING INDEX TABLESPACE projetos
);

--Criando da Tabela Usuario
CREATE TABLE usuario
(
    idusuario SERIAL,
    nomeusuario character varying(100) COLLATE pg_catalog."default" NOT NULL,
    cpfusuario character(14) COLLATE pg_catalog."default" NOT NULL,
    enderecousuario character varying(150) COLLATE pg_catalog."default" NOT NULL,
    cepusuario character(9) COLLATE pg_catalog."default" NOT NULL,
    loginusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    senhausuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    telefoneusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idtipousuario integer NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (idusuario)
        USING INDEX TABLESPACE projetos,
    CONSTRAINT usuario_idtipo_fkey FOREIGN KEY (idtipousuario)
        REFERENCES tipousuario (idtipousuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

--Criando da Tabela Mesa
CREATE TABLE mesa
(
    idmesa SERIAL,
    statusmesa character varying(20) COLLATE pg_catalog."default",
    observacaomesa character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT mesa_pkey PRIMARY KEY (idmesa)
        USING INDEX TABLESPACE projetos
);

--Criando da Tabela Reserva de Mesa
CREATE TABLE reservamesa
(
    idreserva SERIAL,
    idcliente integer,
    idfuncionario integer,
    idmesareservada integer,
    CONSTRAINT reservamesa_pkey PRIMARY KEY (idreserva)
        USING INDEX TABLESPACE projetos,
    CONSTRAINT reservamesa_idcliente_fkey FOREIGN KEY (idcliente)
        REFERENCES usuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT reservamesa_idfuncionario_fkey FOREIGN KEY (idfuncionario)
        REFERENCES usuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT reservamesa_idmesareservada_fkey FOREIGN KEY (idmesareservada)
        REFERENCES mesa (idmesa) MATCH SIMPLE
        ON UPDATE NO ACTION
);

--Criando da Tabela Pedido
CREATE TABLE pedido
(
    idpedido SERIAL,
    datapedido date NOT NULL,
    horapedido character(5) COLLATE pg_catalog."default",
    valor numeric(5,2),
    status integer,
    tipopedido integer,
    identregador integer,
    idfuncionario integer,
    desconto numeric(3,2),
    CONSTRAINT pedido_pkey PRIMARY KEY (idpedido)
        USING INDEX TABLESPACE projetos,
    CONSTRAINT pedido_identregador_fkey FOREIGN KEY (identregador)
        REFERENCES usuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT pedido_idfuncionario_fkey FOREIGN KEY (idfuncionario)
        REFERENCES usuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT pedido_status_fkey FOREIGN KEY (status)
        REFERENCES status (idstatus) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT pedido_tipopedido_fkey FOREIGN KEY (tipopedido)
        REFERENCES tipopedido (idtipopedido) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

--Criando da Tabela Status
CREATE TABLE status
(
    idstatus SERIAL,
    descricaostatus character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT status_pkey PRIMARY KEY (idstatus)
        USING INDEX TABLESPACE projetos
);

-- Criando da Tabela TipoPedido
CREATE TABLE tipopedido
(
    idtipopedido SERIAL,
    descricaotipo character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT tipopedido_pkey PRIMARY KEY (idtipopedido)
        USING INDEX TABLESPACE projetos
);

-- Criando da Tabela ItemPedido

CREATE TABLE itempedido
(
    iditempedido SERIAL,
    idprodutopedido integer,
    idpedidocliente integer,
    quantidade integer,
    CONSTRAINT itempedido_pkey PRIMARY KEY (iditempedido)
        USING INDEX TABLESPACE projetos,
    CONSTRAINT itempedido_idpedidocliente_fkey FOREIGN KEY (idpedidocliente)
        REFERENCES pedido (idpedido) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT itempedido_idprodutopedido_fkey FOREIGN KEY (idprodutopedido)
        REFERENCES produto (idproduto) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);