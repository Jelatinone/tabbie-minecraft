/**
 * Tabbie's first-party Minecraft module: the content families and
 * distributions of Minecraft's Java and Bedrock editions, written as any
 * extension is. It requires the SDK, and compiles with the SDK's processors on
 * its processor path, which write the registration index core reads, so core
 * loads it as it loads any other module.
 *
 * <p>
 * Each package is exported, so other modules can name its families and
 * distributions, and contribute narrower installs for them, and the registry
 * can call its contributions. Each edition has a base every distribution of
 * it extends, registered as the edition's group, giving them their root's
 * permissions and the places of their Worlds and their own files. Typed
 * documents, such as a pack's manifest, extend the SDK's JSON form.
 */
module cat.tabbie.minecraft {
  requires cat.tabbie.sdk;
  requires static lombok;

  exports cat.tabbie.minecraft.content;
  exports cat.tabbie.minecraft.distribution.bedrock;
  exports cat.tabbie.minecraft.distribution.java;
}
