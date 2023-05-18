import React, { useState } from 'react'

export default function Login() {
    const [loginstatus, setloginstatus] = useState(false)

    let message = ''

    // if(loginstatus)
    //     message = <div><p>Welcome Shalini</p></div>
    // else message = <div><p>Welcome Guest</p></div>
    // return (
    //     <div>
    //         {message}
    //     </div>
    // )
    return(
        // <div>
        //     {loginstatus ? <p>Welcome Shalini</p> : <p>Welcome Guest</p>}
        // </div>
        <div>
        {loginstatus && <p>Welcome Shalini</p>}
    </div>
    )
    
}
