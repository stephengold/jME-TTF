jME-TTF
==================

jME-TTF is a TrueType rendering system for jMonkeyEngine.
With this library, you can render text styles loaded directly from a TrueType font (.ttf) file at runtime.
Shapes from the file are written to a dynamically sized texture atlas
and then rendered using a series of quads that display individual characters.
When presented with a text string to display,
jME-TTF scans the string to see if any characters are missing from the atlas,
and if so it adds them, expanding the atlas texture as necessary.

[<img 
src="https://dl.dropboxusercontent.com/s/ldrg036040dx3g4/c5855071bc96733bcb4db72b98356deed0003d2f.png?dl=0"
 alt="jME-TTF Screen" width="567" height="294">](https://dl.dropboxusercontent.com/s/ldrg036040dx3g4/c5855071bc96733bcb4db72b98356deed0003d2f.png?dl=0)

In addition to that you can opt to render scalable text styled from a true type font file in your 3D or 2D scenes. jME-TTF can triangulate a mesh from the glyph outline of each requested character, caching new glyph meshes, and apply a material that interpolates curved sections of the glyph's contours using quadratic bezier formulas. The result is a text that can scale without pixelization and is fully compatible with modern GPU anti-aliasing methods.

[<img 
src="https://dl.dropboxusercontent.com/s/wmgamqzxx5ky4s6/Screenshot_2017_11_17_17.png?dl=0"
 alt="jME-TTF Screen" width="567" height="249">](https://dl.dropboxusercontent.com/s/wmgamqzxx5ky4s6/Screenshot_2017_11_17_17.png?dl=0)

jME-TTF provides a variety of conveniences such as getting the width of a line of text in pixels or world units, the line height, visual heights, scaling and kerning, you can even get a texture displaying blurred text. Formatting options such as vertical/horizontal alignment and text wrapping are also available.

jME-TTF supports outlined text and also assigns several UV layers that can be taken advantage of in your own custom shaders to create a wide variety of different effects.

[<img 
src="https://dl.dropboxusercontent.com/s/oav8rjtu4aebxer/707ad177d0efb01352a00e8a81be9cf6b3b876ef.png?dl=0"
 alt="jME-TTF Screen" width="474" height="400">](https://dl.dropboxusercontent.com/s/oav8rjtu4aebxer/707ad177d0efb01352a00e8a81be9cf6b3b876ef.png?dl=0)

[<img 
src="https://dl.dropboxusercontent.com/s/puy6ebbxc2p5p0i/6983fb0efd926ecd68d1ad2220f557549e37a2c2.png?dl=0"
 alt="jME-TTF Screen" width="696" height="398">](https://dl.dropboxusercontent.com/s/puy6ebbxc2p5p0i/6983fb0efd926ecd68d1ad2220f557549e37a2c2.png?dl=0)

[<img 
src="https://dl.dropboxusercontent.com/s/fydn0y11xxckxp2/1693b179e6b26b076e9748f69eaa010188ae23b9.png?dl=0"
 alt="jME-TTF Screen" width="695" height="415">](https://dl.dropboxusercontent.com/s/fydn0y11xxckxp2/1693b179e6b26b076e9748f69eaa010188ae23b9.png?dl=0)

jME-TTF depends upon Google's Sfntly library available at https://github.com/rillig/sfntly

You can find more about jME-TTF including usage documentation at http://1337atr.weebly.com/jttf.html
