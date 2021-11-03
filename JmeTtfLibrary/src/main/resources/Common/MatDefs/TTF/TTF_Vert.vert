#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform mat4 g_WorldViewProjectionMatrix;
attribute vec3 inPosition;
attribute vec2 inTexCoord;
attribute vec2 inTexCoord2;

varying vec2 texCoord;
varying vec2 texCoord2;

varying vec4 vertColor;

void main() {
    texCoord = inTexCoord;
    texCoord2 = inTexCoord2;

    #ifdef HAS_VERTEXCOLOR
        vertColor = inColor;
    #endif

    gl_Position = g_WorldViewProjectionMatrix * vec4(inPosition, 1.0);
}
