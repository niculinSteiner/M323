function sortObjects(objects) {
    return objects.sort((a, b) => {
        if (a.Datum < b.Datum) return -1;
        if (a.Datum > b.Datum) return 1;

        if (a.Priorität < b.Priorität) return -1;
        if (a.Priorität > b.Priorität) return 1;

        if (a.Titel < b.Titel) return -1;
        if (a.Titel > b.Titel) return 1;

        return 0;
    });
}

let objects = [
    { Datum: '2024-03-05', Priorität: 2, Titel: 'Objekt 1' },
    { Datum: '2024-03-05', Priorität: 1, Titel: 'Objekt 2' },
    { Datum: '2024-03-04', Priorität: 3, Titel: 'Objekt 3' }
];

let sortedObjects = sortObjects(objects);
console.log(sortedObjects);
