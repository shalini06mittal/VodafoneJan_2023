var ele = document.getElementById('res');
// traditional way of making REST API => plain javascript
function getBooks()
{
    let url = 'http://localhost:8081/books';
    const xhr = new XMLHttpRequest();
    xhr.open('GET', url);
    console.log('1',xhr.readyState)
    xhr.onreadystatechange = alertContents; 	
	xhr.send(); 
	console.log('2',xhr.readyState)
    function alertContents() { 
        console.log('3',xhr.readyState)
        if (xhr.readyState === XMLHttpRequest.DONE) 		 	
        { 
            if (xhr.status === 200) { 				
                //console.log(xhr.responseText); 
                let books = JSON.parse(xhr.responseText);
                console.log(books);
                let str=''
                for(let book of books)
                {
                //    str+=`<p>${JSON.stringify(book)}</p>`
                str+=`<p>Id : ${book.bookid} Title : ${book.booktitle}</p>`
                }
                ele.innerHTML = str;
            } 
            else { 
                alert('There was a problem with the request.'); 
            } 
        } 
    } 
}

// get data fron REST API we used promises

// function getBooksWithPromise()
// {
//     return new Promise((resolve, reject)=>{
//         console.log('promise')
//         let url = 'http://localhost:8081/books';
//         const xhr = new XMLHttpRequest();
//         xhr.open('GET', url);
//         xhr.onload = () => resolve(xhr.responseText);
//         xhr.onerror = () => reject(xhr.statusText);
//         xhr.send();
//     });
// }
   
// // getBooksWithPromise().then(data => console.log(data))
// // .catch(err => console.log(err))

// function getBookCallingPromise()
// {
//     console.log('get all books')
//     getBooksWithPromise().then(data => {
//         console.log(data)
//         let books = JSON.parse(data);
//         console.log(books);
//         let str=''
//         for(let book of books)
//         {
       
//             str+=`<p>Id : ${book.bookid} Title : ${book.booktitle}</p>`
//         }
//         ele.innerHTML = str;   
//     })
//     .catch(err => console.log(err))
// }


// simple promise object
var x = 11;
console.log('promise object creating...')
var promise = new Promise((resolve , reject)=>{
    console.log('promise executing')
    if(x%2==0) resolve('success')
    else reject('failure')
});
console.log('promise created')
promise.then(data => console.log(data))
.catch(err => console.log(err))

function getBooksWithFetchApi()
{
    let url = 'http://localhost:8080/books';
    fetch(url).then(data => data.json())
    .then(books => console.log(books))
    .catch(err => console.log(err))
}
getBooksWithFetchApi()