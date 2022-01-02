import React from 'react';
import 'intl';
import 'intl/locale-data/jsonp/pt-BR';
import Reactotron from 'reactotron-react-native';

import TelaPadrao from './src/components/TelaPadrao';
import Rotas from './src/Rotas';

Reactotron.configure().useReactNative().connect();

export default function App() {
  Reactotron.log("Alura");

  return <TelaPadrao><Rotas /></TelaPadrao>;
}