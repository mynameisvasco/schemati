# Schemati - Config File

### Element strucutre

| Field       | Type     | Required  |
| ----------- | -------- | --------- |
| identifier  | String   | :tw-2705: |
| inputNodes  | Object[] | :tw-2705: |
| outputNodes | Object[] | :tw-2705: |
| image       | String   | :tw-2705: |

### Example

    element RESISTENCE {
        identifier: "Resistence",
        inputNodes: [
            {
                x: 10,
                y: 0,
            },
            {
                x: 10,
                y: 10,
            }
        ],
        outputNode: [
            {
                x: 20,
                y: 0,
            },
            {
                x: 20,
                y: 10,
            }
        ]
        image: "res/resistence.png",
    }
