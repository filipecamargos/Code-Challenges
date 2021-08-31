/*Implement an algorithm to determine if a string has all unique character. 
What if you cannot use additional data structure.
Source: Craking The Coding Internview pg. 90*/

//Implementation with a map O(n)
function isUnique(passedString) {
    if (typeof passedString != 'string' || !passedString) {
        throw new Error(`Value ${passedString} is Invalid!`)
    }

    //Map the key as the character and the quantity as the value
    const characterMap = new Map();
    for (let i of passedString) {
        //check if the character has been added
        if (characterMap.has(i)) {
            characterMap.set(i, characterMap.get(i) + 1);
        } else {
            characterMap.set(i, 1);
        }
    }

    for (let [key, value] of characterMap) {
        if (value > 1) {
            return false;
        }
    }

    return true;
}

//Implement without using a Data Structure O(n^2)
function isUnique1(passedString) {
    if (typeof passedString != 'string' || !passedString) {
        throw new Error(`Value ${passedString} is Invalid!`)
    }

    for (let i = 0; i < passedString.length; i++) {
        for (let j = 0; j < passedString.length; j++) {
            if (i != j && passedString[i] === passedString[j]) {
                return false;
            }
        }
    }

    return true;
}

//Drive code
try {
    //test using Map()
    console.log(isUnique('abc') + ' => true');
    console.log(isUnique('abb') + ' => false');
    console.log(isUnique('abcdefgop') + ' => true');
    console.log(isUnique('abcdefgoplma') + ' => false');

    console.log('-------------------------------------------')

    //test using without any extra Data Structure
    console.log(isUnique1('abc') + ' => true');
    console.log(isUnique1('abb') + ' => false');
    console.log(isUnique1('abcdefgop') + ' => true');
    console.log(isUnique1('abcdefgoplma') + ' => false');
} catch (err) {
    console.log(err);
}