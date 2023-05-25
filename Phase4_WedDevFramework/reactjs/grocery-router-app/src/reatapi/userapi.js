let url = 'http://localhost:3000'

export let success = "SUCCESS";
export let failure = "FAILURE";

export async function validateUser(id, password)
{
    let response = await fetch(`${url}/users/${id}`)
    let loginuser = await response.json();
    console.log(loginuser)
    if(Object.keys(loginuser).length == 0)
        return Promise.reject(failure)
    if(password === loginuser.password)
        return Promise.resolve(success);
    return Promise.reject(failure)
}

export async function registerUser(user)
{
    let response = await fetch(`${url}/users`,{
        method:'POST',
        body: JSON.stringify(user),
        headers:{
            'Content-Type' : 'application/json'
        }
    })
    let data = await response.json()
    console.log(data);
    return data;
}
export function isUserLoggedIn()
{
    return sessionStorage.getItem('id') !== null
   
}
export function logout()
{
    sessionStorage.removeItem('id')
}

