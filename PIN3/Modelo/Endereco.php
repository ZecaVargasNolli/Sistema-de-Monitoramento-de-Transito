<?php

class Endereco {
    
    private $codigo;
    private $complemento;
    private $numero;
    private $pontoReferencia;
    private $Cidade;
    private $Cep;
    
    public function getCodigo() {
        return $this->codigo;
    }

    public function setCodigo($codigo) {
        $this->codigo = $codigo;
    }
    
    public function getComplemento() {
        return $this->complemento;
    }

    public function setComplemento($complemento) {
        $this->complemento = $complemento;
    }
    
    public function getNumero() {
        return $this->numero;
    }

    public function setNumero($numero) {
        $this->numero = $numero;
    }

    public function getPontoReferencia() {
        return $this->pontoReferencia;
    }

    public function setPontoReferencia($pontoReferencia) {
        $this->pontoReferencia = $pontoReferencia;
    }
    
    public function getCidade() {
        return $this->Cidade;
    }

    public function setCidade($Cidade) {
        $this->Cidade = $Cidade;
    }
    
    public function getCep() {
        return $this->Cep;
    }

    public function setCep($Cep) {
        $this->Cep = $Cep;
    }
    
    function __construct($codigo, $complemento, $numero, $pontoReferencia, $Cidade, $Cep) {
        $this->codigo = $codigo;
        $this->complemento = $complemento;
        $this->numero = $numero;
        $this->pontoReferencia = $pontoReferencia;
        $this->Cidade = $Cidade;
        $this->Cep = $Cep;
    }

}