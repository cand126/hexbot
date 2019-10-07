![Hexbot](https://user-images.githubusercontent.com/212941/59163439-23c05900-8ab6-11e9-8764-977334c7bba8.png)

# 👋 My Hexbot

## ❤ Introduction

A JavaFX application which is able to change the background color.

## ⚙ Requirements

- Java 11
- Maven 3

## 🛠 Build

```bash
mvn javafx:compile
mvn javafx:run
```

## ✨ Ideas

- **Randomize the colors:** Request 1,000 colors and display them at random on screen, then every 5 seconds request another 1,000 colors and animate them to their next color.
- **Pointillism:** Make an homage to [George Seurat](https://en.wikipedia.org/wiki/Georges_Seurat), credited with creating [Pointillism](https://en.wikipedia.org/wiki/Pointillism). Take a picture from the [Unsplash API](https://unsplash.com/developers), break it up into smaller pieces, and rebuild it with random colors from the Hexbot. (Pass `width` and `height` to the API to get random coordinates with your data)
- **Search for the color:** Use the color to load images from a search engine with color indexes (like [DesignInspiration](https://www.designspiration.net/search/saves/?q=2cdaad) and [Dribbble](https://dribbble.com/colors/000000?s=popular)) and do something with the result.
- **Make a mood ring:** Colors are often associated with [different traits](https://en.wikipedia.org/wiki/Color_symbolism). Build a color sentiment engine, then evaluate how each color returned by the Hexbot should make you feel.
- **Name the colors:** Paint color names are ridiculous (anything with "Greige" will do nicely), and a robot can come up with even better. You can use a [neural net fed with thousands of paint names](https://aiweirdness.com/post/160776374467/new-paint-colors-invented-by-neural-network) or make a [Markov chain](https://en.wikipedia.org/wiki/Markov_chain) of pleasant, paint-y sounding names.
- **Why only colors?** Who says a hex code has to be a color? Break it up into rgb and you have a 3D coordinate. Use those three points to play a tone, or provide the randomized physics in a game. Convert the value from hex to decimal, and now you have a number between 0 and 16,777,216 to play with.

## 📔 Reference

More about Hexbot here: https://noopschallenge.com/challenges/hexbot
