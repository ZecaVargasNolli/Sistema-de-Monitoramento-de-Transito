<?php

class Cep {
    
    private $codigo;
    private $cep;
    
    public function getCodigo() {
        return $this->codigo;
    }

    public function setCodigo($codigo) {
        $this->codigo = $codigo;
    }
    
    public function getCep() {
        return $this->cep;
    }

    public function setCep($cep) {
        $this->cep = $cep;
    }

    function __construct($codigo, $cep) {
        $this->codigo = $codigo;
        $this->cep = $cep;
    }
}

