let items = []
let url = 'http://localhost:3000'
export async function getItems(){

    // fetch(`${url}/items`)
    // .then(response => response.json())
    // .then(data => items = data);

    let response = await fetch(`${url}/items`)
    items = await response.json()
    console.log(items)
    return items;
    
}

export function getItemById(id){
    return items.find(item => item.id === id)
}

// export default {
//     "getItems":getItems,
//     "getItemById":getItemById
// }