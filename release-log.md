# Release log for the jME-TTF library

## v2.2.4

Upgrade JME to v3.4.0-stable.

## v2.2.3+for34

Upgrade JME to v3.4.0-beta3.

## v2.2.3

+ Removed POM dependency on "jme3-desktop:[3.1,)".
+ Specified precise versions of dependencies
  and switched from JCenter to Maven Central Repository.
+ Automated deployment using the "com.github.stephengold" group ID.
+ Added a Gradle wrapper.
+ Deleted the build scripts for Apache Ant.

## v2.2.2

Fixed TrueTypeBMPContainer so it no longer ignores empty lines.

## v2.2.1

+ Converted to Gradle project.
+ Added ability to specify atlas texture size for bitmap fonts.
+ Added example usage.

## v2.12

Fixed a bug that could cause a crash
when using a StringContainer too small to display any text.

## v2.11

Added the ability to specify a maximum texture resolution for non-mesh fonts
in the constructor and removed DirectByteBuffer destruction from
TrueTypeSfntly instances as this is taken care of by the garbage collector.

## v2.1

One can now specify a string of characters to initialize a font
with in a TrueTypeFont constructor and via TrueTypeKeys.

## v2b

+ Added additional padding to texture atlases to correct for UV rounding errors.
+ Added a shader directive instructing shaders running on GLES devices
  to insert 'mediump float;'

## v2a

Fixed an issue that could cause a crash when trying to display clipped text
using word or char wrapping when the available display space is too small
to display any text including the optional ellipsis.
