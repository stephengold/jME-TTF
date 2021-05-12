#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform mat4 g_WorldViewProjectionMatrix;
attribute vec3 inPosition;
attribute vec2 inTexCoord;
attribute vec4 inColor;

varying vec2 texCoord;

varying vec4 vertColor;

void main() {
    texCoord = inTexCoord;

    #ifdef HAS_VERTEXCOLOR
        vertColor = inColor;
    #endif

    gl_Position = g_WorldViewProjectionMatrix * vec4(inPosition, 1.0);
}
