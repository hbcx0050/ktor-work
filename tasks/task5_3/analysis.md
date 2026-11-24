# Colour Contrast Analysis

Colours from `text.css`:

| Role       | Hex       | R   | G   | B   |
|------------|-----------|-----|-----|-----|
| Text       | `#327832` | 50  | 120 | 50  |
| Background | `#dff0d8` | 223 | 240 | 216 |

## Relative Luminances

Following the [WCAG 2.2 definition](https://www.w3.org/TR/WCAG22/relative-luminance.html),
each 8-bit channel is scaled to sRGB (`c / 255`) and then linearised:

- if `c <= 0.04045`, then `c / 12.92`
- otherwise `((c + 0.055) / 1.055) ^ 2.4`

The relative luminance is then `L = 0.2126 R + 0.7152 G + 0.0722 B`.

Text `#327832`:

- R = 50/255 = 0.1961, which linearises to 0.0319 (B is the same)
- G = 120/255 = 0.4706, which linearises to 0.1878
- L = 0.2126 × 0.0319 + 0.7152 × 0.1878 + 0.0722 × 0.0319 = **0.1434**

The text has a relative luminance of **0.1434**.

Background `#dff0d8`:

- R = 223/255 = 0.8745, which linearises to 0.7379
- G = 240/255 = 0.9412, which linearises to 0.8714
- B = 216/255 = 0.8471, which linearises to 0.6867
- L = 0.2126 × 0.7379 + 0.7152 × 0.8714 + 0.0722 × 0.6867 = **0.8297**

The background colour's relative luminance is **0.8297**.

## Contrast Ratio

The background is the lighter colour, so

C = (L1 + 0.05) / (L2 + 0.05) = (0.8297 + 0.05) / (0.1434 + 0.05) = 0.8797 / 0.1934 ≈ **4.55**

The page has a contrast ratio of **4.55:1**.

## Conclusion

| Criterion | Level | Normal text | Large text | Body text (4.55:1) | `h1` (large, 4.55:1) |
|-----------|-------|-------------|------------|--------------------|----------------------|
| [1.4.3 Contrast (Minimum)](https://www.w3.org/TR/WCAG22/#contrast-minimum)   | AA  | 4.5:1 | 3:1   | Pass (just) | Pass |
| [1.4.6 Contrast (Enhanced)](https://www.w3.org/TR/WCAG22/#contrast-enhanced) | AAA | 7:1   | 4.5:1 | Fail        | Pass (just) |

The page satisfies **WCAG 1.4.3** but not **WCAG 1.4.6**. The paragraph text is
normal size, so it needs 7:1 for 1.4.6, and 4.55:1 falls well short of that.
The `h1` counts as large text (bold, at least 14pt), so on its own it would meet
1.4.6, but a page meets a criterion only if all of its text does.

The margin for 1.4.3 is very small (4.55 against 4.5). Making the green even
slightly lighter, or the background slightly darker, would make the page fail AA.
