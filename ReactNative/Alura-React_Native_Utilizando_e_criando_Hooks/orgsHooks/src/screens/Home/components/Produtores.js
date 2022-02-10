import React from 'react';
import { FlatList, StyleSheet, Text } from 'react-native';

import Produtor from './Produtor';
// import { carregaProdutores } from '../../../services/carregaDados';
import useProdutores from '../../../hooks/useProdutores';

export default function Produtores({ topo: Topo }) {
    const [titulo, lista] = useProdutores();
    // const [titulo, setTitulo] = useState('');
    // const [lista, setLista] = useState([]);

    // useEffect(() => {
    //     const retorno = carregaProdutores();
    //     setTitulo(retorno.titulo);
    //     setLista(retorno.lista);
    // }, []);

    /*
    const listaOrdenadaPorDistancia = () => {
        lista.sort(function (x, y) {
            return x.distancia - y.distancia;
        });
    }
    const listaOrdenadaPorEstrelas = () => {
        lista.sort(function (x, y) {
            return x.estrelas - y.estrelas;
        });
    }
    const listaOrdenadaPorNome = () => {
        lista.sort(function (x, y) {
            let a = x.nome.toUpperCase(),
                b = y.nome.toUpperCase();
            return a == b ? 0 : a > b ? 1 : -1;
        })
    }
    */

    //listaOrdenadaPorDistancia();
    //listaOrdenadaPorEstrelas();
    //listaOrdenadaPorNome();
    //console.log('lista: ', lista);

    const TopoLista = () => {
        return <>
            <Topo />
            <Text style={estilos.titulo}>{titulo}</Text>
        </>
    }
    return <FlatList
        data={lista}
        renderItem={({ item }) => <Produtor {...item} />}
        keyExtractor={({ nome }) => nome}
        ListHeaderComponent={TopoLista}
    />
}

const estilos = StyleSheet.create({
    titulo: {
        fontSize: 20,
        lineHeight: 32,
        marginHorizontal: 16,
        marginTop: 16,
        fontWeight: 'bold',
        color: '#464646'
    }
})