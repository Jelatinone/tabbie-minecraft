# tabbie-minecraft

Tabbie's first-party Minecraft module: the content families and distributions of Minecraft's Java and Bedrock
editions, written as any extension is: against the published [tabbie-sdk](https://github.com/Jelatinone/tabbie-sdk),
with its processors checking every contribution.

## Building

The module uses the SDK through its published builds. For a local snapshot of the SDK, publish it first:

```bash
cd ../sdk && ./gradlew publishToMavenLocal
```

Then build the module:

```bash
./gradlew build
```
