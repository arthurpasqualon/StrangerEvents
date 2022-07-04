import {StyleSheet} from 'react-native';

export default StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    backgroundColor: '#000000',
    justifyContent: 'center',
  },
  logo: {
    height: 150,
    resizeMode: 'contain',
  },
  image: {
    height: 96,
    width: 96,
    borderRadius: 12,
    margin: 24,
  },
  button: {
    width: 180,
    padding: 14,
    borderRadius: 24,
    margin: 24,
    backgroundColor: '#ff1515',
  },
  buttonText: {
    fontSize: 22,
    textAlign: 'center',
    fontWeight: 'bold',
  },
  text: {
    fontSize: 22,
    color: '#ffffff',
    textAlign: 'center',
    fontWeight: 'bold',
  },
  score: {
    margin: 18,
    fontSize: 22,
    color: '#ff1515',
    textAlign: 'center',
    fontWeight: 'bold',
  },
});
