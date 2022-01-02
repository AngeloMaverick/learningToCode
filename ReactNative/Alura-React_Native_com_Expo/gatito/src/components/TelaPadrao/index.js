import React from 'react';
import { SafeAreaView, StatusBar } from 'react-native';
import estilosGlobal, { cores } from '../../estilos';
import estilos from './estilos';

export default function TelaPadrao({ children }) {
    return <>
        <SafeAreaView style={estilos.ajusteTela}>
            <StatusBar backgroundColor={cores.roxo} />
            {/*<KeyboardAvoidingView
        behavior={Platform.OS == "ios" ? "padding" : "height"}
        style={estilosGlobal.preencher}
    >*/}
            {children}
            {/*</KeyboardAvoidingView>*/}
        </SafeAreaView>
        {/*StatusBar de baixo, caso visível no celular utilizado. */}
        <SafeAreaView style={estilos.ajusteTelaBaixo} />
    </>
}