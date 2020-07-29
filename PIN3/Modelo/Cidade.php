<?php

class Cidade {
    
    private $codigo;
    private $nome;
    private $Bairro;
    
    public function getCodigo() {
        return $this->codigo;
    }

    public function setCodigo($codigo) {
        $this->codigo = $codigo;
    }
    
    public function getNome() {
        return $this->nome;
    }

    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function getBairro() {
        return $this->Bairro;
    }

    public function setBairro($Bairro) {
        $this->Bairro = $Bairro;
    }
    
    function __construct($codigo, $nome, $Bairro) {
        $this->codigo = $codigo;
        $this->nome = $nome;
        $this->Bairro = $Bairro;
    }

}