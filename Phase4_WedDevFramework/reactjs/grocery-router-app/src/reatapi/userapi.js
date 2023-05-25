let url = 'http://localhost:3000'

export async function validateUser(id, password)
{
    let response = await fetch(`${url}/users/${id}`)
    let loginuser = await response.json();
    console.log(loginuser)
    return loginuser;
}

