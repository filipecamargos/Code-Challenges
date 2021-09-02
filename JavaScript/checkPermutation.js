/*Given two strings, write a method to decide if one is permutation of the other */
function isPermutation(firstString, secondString) {

    if (typeof firstString != 'string' || typeof secondString != 'string') {
        throw new Error('Invalid type!');
    }

    //If the spaces and case sensitive does not matter lets remove it to a clean string.
    let cleanFirstString = firstString.replace(/\s/g, '').toLowerCase();
    let secondCleanString = secondString.replace(/\s/g, '').toLowerCase();

    //if they have different sizes they can't be a permutation of each other
    if (cleanFirstString.length != secondCleanString.length) {
        return false;
    }

    return sortString(cleanFirstString) == sortString(cleanFirstString);

}

function sortString(passedString) {
    return passedString.split('').sort().join('');
}

//test
try {
    console.log(`${isPermutation('aB c d', 'd bca')} => true`);
    console.log(`${isPermutation('aB c d', 'd bdca')} => false`);
    console.log(`${isPermutation('aB c dgedmma', 'ammde dgca b')} => true`);
    console.log(`${isPermutation('aB c dgedma', 'ammde dgca b')} => false`);

} catch (err) {
    console.log(err)
}