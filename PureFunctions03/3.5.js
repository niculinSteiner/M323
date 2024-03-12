function extractLeaves(tree) {
    let leaves = [];

    function dfs(node) {
        if (!node.children || node.children.length === 0) {
            leaves.push(node.value);
        } else {
            for (let child of node.children) {
                dfs(child);
            }
        }
    }
    dfs(tree);
    return leaves;
}

let tree = {
    value: 'A',
    children: [
        {
            value: 'B',
            children: [
                { value: 'D'},
                { value: 'E', children: [] }
            ]
        },
        {
            value: 'C',
            children: [
                { value: 'F', children: [] },
                { value: 'G', children: [] }
            ]
        }
    ]
};

let leaves = extractLeaves(tree);
console.log(leaves);
