 export const comunication = () => {
  return fetch('https://rickandmortyapi.com/api/character')
  .then((response) => response.json())
};
