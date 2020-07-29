<?php

class Mercado {
    
    private $codigo;
    private $nome;
    private $Endereco;
    private $logo;
    
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
    
    public function getEndereco() {
        return $this->Endereco;
    }

    public function setEndereco($Endereco) {
        $this->Endereco = $Endereco;
    }
    
    public function getLogo() {
        return $this->logo;
    }

    public function setLogo($logo) {
        $this->logo = $logo;
    }
    
    public function __construct($codigo, $nome, $Endereco) {
        $this->codigo = $codigo;
        $this->nome = $nome;
        $this->Endereco = $Endereco;
    }

}