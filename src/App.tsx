import React, {Fragment, useCallback, useEffect, useState} from 'react';
import {
  View,
  NativeModules,
  Text,
  NativeEventEmitter,
  TouchableOpacity,
  Image,
} from 'react-native';
import styles from './styles';

const logo = require('./assets/StrangerThings.png');

const {StrangerEventsService} = NativeModules;
const event = new NativeEventEmitter(StrangerEventsService);

type ResponseType = {
  name: string;
  url: string;
  punctuation: number;
};

const App = () => {
  const [currentEvent, setCurrentEvent] = useState<ResponseType | undefined>();
  const [total, setTotal] = useState(0);

  const isVecna = currentEvent?.name === 'Vecna';

  useEffect(() => {
    event.addListener('strangeEvent', (res: ResponseType) => {
      setCurrentEvent(res);
      setTotal(oldValue => oldValue + Number(res.punctuation));
    });
  }, []);

  const start = useCallback(() => StrangerEventsService.start(), []);
  const restart = useCallback(() => {
    setTotal(0);
    setCurrentEvent(undefined);
  }, []);

  return (
    <View style={styles.container}>
      <Image source={logo} style={styles.logo} />
      {!!total && (
        <Fragment>
          <Text style={styles.text}>Scrore: {total}</Text>
          <Image style={styles.image} source={{uri: currentEvent?.url}} />
          <Text style={styles.text}>{currentEvent?.name}</Text>
          {!isVecna && (
            <Text style={styles.text}>{currentEvent?.punctuation}</Text>
          )}
        </Fragment>
      )}
      {!isVecna && (
        <TouchableOpacity onPress={start} style={styles.button}>
          <Text style={styles.buttonText}>Play</Text>
        </TouchableOpacity>
      )}
      {isVecna && (
        <TouchableOpacity onPress={restart} style={styles.button}>
          <Text style={styles.buttonText}>Restart</Text>
        </TouchableOpacity>
      )}
    </View>
  );
};

export default App;
