import React, { useState } from 'react';

import { TouchableOpacity, View, Text } from 'react-native'; //Resolvido
import Botao from '../Botao';
import CampoInteiro from '../CampoInteiro';
import estilos from './estilos';
//import Botao from '../../../components/Botao';

//import CampoInteiro from '../../../components/CampoInteiro';

//import estilos from './estilos';

export default function Item({ nome, preco, descricao, quantidade: quantidadeInicial, tela }) {
    const [quantidade, setQuantidade] = useState(quantidadeInicial);
    const [total, setTotal] = useState(preco * quantidadeInicial);
    const [expandir, setExpandir] = useState(false); //Resolvido
    const isCarrinho = tela === "carrinho";

    const atualizaQuantidadeTotal = (novaQuantidade) => {
        setQuantidade(novaQuantidade);
        calculaTotal(novaQuantidade);
    }

    const calculaTotal = (novaQuantidade) => {
        setTotal(novaQuantidade * preco);
    }

    const inverteExpandir = () => {  //Resolvido
        setExpandir(!expandir);      //Resolvido
        atualizaQuantidadeTotal(0);  //Resolvido
    }

    return <>
        {/*Resolvido*/}
        <TouchableOpacity
            style={estilos.informacao}
            onPress={inverteExpandir}
            disabled={isCarrinho}>

            <Text style={estilos.nome}>{nome}</Text>
            <Text style={estilos.descricao}>{descricao}</Text>
            <Text style={estilos.preco}>{
                Intl.NumberFormat('pt-BR', {
                    style: 'currency', currency: 'BRL'
                }).format(preco)
            }</Text>
        </TouchableOpacity>

        {/*Resolvido*/}
        {(expandir || isCarrinho) &&
            <View style={estilos.carrinho}>
                <View>
                    <View style={estilos.valor}>
                        <Text style={estilos.descricao}>Quantidade:</Text>
                        <CampoInteiro estilos={estilos.quantidade} valor={quantidade} acao={atualizaQuantidadeTotal} />
                    </View>
                    <View style={estilos.valor}>
                        <Text style={estilos.descricao}>Total:</Text>
                        <Text style={estilos.preco}>{
                            Intl.NumberFormat('pt-BR', {
                                style: 'currency', currency: 'BRL'
                            }).format(total)
                        }</Text>
                    </View>
                </View>

                {/*Resolvido*/}
                <Botao valor={isCarrinho ? "Remover do Carrinho" : "Adicionar ao Carrinho"} acao={() => { }} />

            </View>
        }
        <View style={estilos.divisor} />
    </>
}