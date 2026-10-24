# Gradient Descent & 2D Gradient Application (z = f(a, s))

## Sum of Squared Residuals
<p align="center">
  <img src="gradient descent visualization.png" alt="3D Paraboloid & 2D Convergence Contour Map" width="100%">
</p>

a 3D paraboloid error function && leading coefficient > 0 $\implies$ its partial derivatives = 0 $\Leftrightarrow$ its coordinate = slope & intercept of the linear regression

linear regression: $l(x)=mx+b$

**SSR function (Sum of Squared Residuals):**

$$
f(m, b) = \sum ((mx_i + b)-y_i)^2
$$

**SSR Partial Derivatives:**

$$
\frac{\partial f}{\partial m} = \sum 2x_i((mx_i + b) - y_i) \qquad \frac{\partial f}{\partial b} = \sum 2((mx_i + b) - y_i)
$$


**2D Gradient of SSR (using learning rate $\eta$):**

<p align="center">
  <img src="image_5a2b4b4.jpg" alt="a" width="100%">
</p>

$\nabla f$ is a vector field (set of continuous vector outputs)

$$
\nabla f(m, b) = \frac{\partial f}{\partial m} \ \hat{i} + \frac{\partial f}{\partial b} \ \hat{j}
$$

**2D Countour Vector Projection**

$$
\vec{x}_n = m_n \hat{i} + b_n \hat{j} \quad \text{(on mb-plane)}
$$

**To find Vertex Coordinate**

$$
\frac{\partial f}{\partial m} = 0 \ \text{ and } \ \frac{\partial f}{\partial b} = 0 \qquad \Leftrightarrow \qquad \|\nabla f(m_\text{vertex}, b_\text{vertex})\| = 0
$$

**Step Size Algorithm:**

$$
\vec{x}_{n+1} = \vec{x}_n - \eta \ \nabla f(m_n, b_n) \qquad \Leftrightarrow \qquad s_{n+1} = s_n - \eta \ \left. \frac{\partial f}{\partial m} \right |_{(m, b) = (m_n, b_n)} \ \text{ and } \quad m_{n+1} = m_n - \eta \ \left. \frac{\partial f}{\partial b} \right |_{(m, b) = (m_n, b_n)}
$$

$\lim_{n \to \infty} a_n = a_{\text{vertex}}$ and $\lim_{n \to \infty} s_n = s_{\text{vertex}}$ thus, threshold ($\approx 0$) needed



## Project Overview
- (Implementation):  Integrated partial differentiation to upgrade a Java-based linear regression tool for highway traffic modeling.
- (Tools Extension): Self-studied Vector Calculus to re-analyze the optimization trajectory via 2D Gradient Field (∇f).


# Convergence & Limitations
- The algorithm requires a sufficiently small learning rate (η) to ensure convergence. On a paraboloid surface (unsure about other shapes), convergence slows significantly near the local minimum as the gradient magnitude approaches zero (||∇f|| ≈ 0), illustrating the classic vanishing gradient behavior in basic optimization
